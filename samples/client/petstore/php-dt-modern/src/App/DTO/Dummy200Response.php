<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\PhpAttribute as DTA;

class Dummy200Response
{
    #[DTA\Data(field: "outerProp", nullable: true)]
    #[DTA\Strategy("Object", ["type" => \App\DTO\Dummy200ResponseOuterProp::class])]
    #[DTA\Validator("TypeCompliant", ["type" => \App\DTO\Dummy200ResponseOuterProp::class])]
    public \App\DTO\Dummy200ResponseOuterProp|null $outer_prop = null;

}
