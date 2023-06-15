<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\PhpAttribute as DTA;

/**
 * 
 */
class ExampleResponse
{
    #[DTA\Data(field: "myOnlyProperty", nullable: true)]
    #[DTA\Strategy("Object", ["type" => \App\DTO\Collection::class])]
    #[DTA\Validator("TypeCompliant", ["type" => \App\DTO\Collection::class])]
    public \App\DTO\Collection|null $my_only_property = null;

}
