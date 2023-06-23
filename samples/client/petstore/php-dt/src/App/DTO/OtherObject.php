<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * dummy
 */
class OtherObject
{
    /**
     * @DTA\Data(field="myOnlyProperty2", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ExampleResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ExampleResponse::class})
     * @var \App\DTO\ExampleResponse|null
     */
    public $my_only_property2;

}
